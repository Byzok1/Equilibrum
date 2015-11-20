package view;

import controller.Controller;
import javafx.geometry.Point3D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.transform.Rotate;
import terrainClass.Land;
import terrainClass.Sand;
import terrainClass.Water;
import terrainEntityClass.Tree;
import tile.Tile;
import trigger.Trigger;
import unit.Unit;
import unitClass.Duck;
import world.World;

public class Render
{

	public Render(Controller control, World world, boolean td)
	{
		if (td)
		{
			init3dRender(control, world);
		} else
		{
			initConsoleRender(control, world);
		}

	}

	private void init3dRender(Controller control, World world)
	{
		// Timeline timeline = new Timeline();
		// timeline.setCycleCount(2);
		// timeline.setAutoReverse(true);
		// timeline.setDelay(Duration.seconds(5));
		// timeline.getKeyFrames().add(new KeyFrame(Duration.millis(1000),
		// new KeyValue (testBox.translateXProperty(), 125)));
		// timeline.play();

		for (Tile t : world.getTiles())
		{
			// create a imageView with default size
			Box i = new Box(50, 50, 0);
			Box se = new Box(50, 50, 0);
			Box sn = new Box(50, 50, 0);
			Box sw = new Box(50, 50, 0);
			Box ss = new Box(50, 50, 0);

			if (t.getTerrain() instanceof Land)
			{
				i.setMaterial(new PhongMaterial(new Color(0, 0, 0, 1), null,
						null, null, new Image("land.png")));
				sn.setMaterial(new PhongMaterial(new Color(0, 0, 0, 1), null,
						null, null, new Image("land.png")));
				se.setMaterial(new PhongMaterial(new Color(0, 0, 0, 1), null,
						null, null, new Image("land.png")));
				sw.setMaterial(new PhongMaterial(new Color(0, 0, 0, 1), null,
						null, null, new Image("land.png")));
				ss.setMaterial(new PhongMaterial(new Color(0, 0, 0, 1), null,
						null, null, new Image("land.png")));
			} else if (t.getTerrain() instanceof Water)
			{
				i.setMaterial(new PhongMaterial(new Color(0, 0, 0, 1), null,
						null, null, new Image("water.png")));
				sn.setMaterial(new PhongMaterial(new Color(0, 0, 0, 1), null,
						null, null, new Image("water.png")));
				se.setMaterial(new PhongMaterial(new Color(0, 0, 0, 1), null,
						null, null, new Image("water.png")));
				sw.setMaterial(new PhongMaterial(new Color(0, 0, 0, 1), null,
						null, null, new Image("water.png")));
				ss.setMaterial(new PhongMaterial(new Color(0, 0, 0, 1), null,
						null, null, new Image("water.png")));
			} else if (t.getTerrain() instanceof Sand)
			{
				i.setMaterial(new PhongMaterial(new Color(0, 0, 0, 1), null,
						null, null, new Image("sand.png")));
				sn.setMaterial(new PhongMaterial(new Color(0, 0, 0, 1), null,
						null, null, new Image("sand.png")));
				se.setMaterial(new PhongMaterial(new Color(0, 0, 0, 1), null,
						null, null, new Image("sand.png")));
				sw.setMaterial(new PhongMaterial(new Color(0, 0, 0, 1), null,
						null, null, new Image("sand.png")));
				ss.setMaterial(new PhongMaterial(new Color(0, 0, 0, 1), null,
						null, null, new Image("sand.png")));
			}

			i.setLayoutX(t.getPos().x * Tile.FLOATING_SIZE);
			i.setLayoutY(t.getPos().y * Tile.FLOATING_SIZE);
			i.setTranslateZ(-(Tile.FLOATING_SIZE / 2));
			sn.setLayoutX(t.getPos().x * Tile.FLOATING_SIZE);
			sn.setLayoutY(t.getPos().y * Tile.FLOATING_SIZE
					- Tile.FLOATING_SIZE / 2);
			se.setLayoutX(t.getPos().x * Tile.FLOATING_SIZE
					- Tile.FLOATING_SIZE / 2);
			se.setLayoutY(t.getPos().y * Tile.FLOATING_SIZE);
			sw.setLayoutX(t.getPos().x * Tile.FLOATING_SIZE
					+ Tile.FLOATING_SIZE / 2);
			sw.setLayoutY(t.getPos().y * Tile.FLOATING_SIZE);
			ss.setLayoutX(t.getPos().x * Tile.FLOATING_SIZE);
			ss.setLayoutY(t.getPos().y * Tile.FLOATING_SIZE
					+ Tile.FLOATING_SIZE / 2);

			sn.getTransforms().add(new Rotate(90, new Point3D(1, 0, 0)));
			sw.getTransforms().add(new Rotate(90, new Point3D(0, 1, 0)));
			se.getTransforms().add(new Rotate(-90, new Point3D(0, 1, 0)));
			ss.getTransforms().add(new Rotate(-90, new Point3D(1, 0, 0)));

			control.root.getChildren().add(sn);
			control.root.getChildren().add(sw);
			control.root.getChildren().add(se);
			control.root.getChildren().add(ss);
			control.root.getChildren().add(i);
		}

		for (Unit u : world.getUnits())
		{
			Box b = new Box(25, 25, 25);
			
			if (u instanceof Duck)
			{
				b.setMaterial(new PhongMaterial(new Color(0, 0, 0, 1), null,
						null, null, new Image("duck.png")));
			}
			
			b.setLayoutX(u.getPosition().x);
			b.setLayoutY(u.getPosition().y);
			b.setTranslateZ(-50);
			
			b.getTransforms().add(new Rotate(90, new Point3D(1, 0, 0)));
			control.root.getChildren().add(b);
			
//			ImageView i = new ImageView();
//
//			if (u instanceof Duck)
//			{
//				i.setImage(new Image("duck.png"));
//			}
//			i.setLayoutX(u.getPosition().x);
//			i.setLayoutY(u.getPosition().y);
//			i.setTranslateZ(-50);

//			i.getTransforms().add(new Rotate(90, new Point3D(1, 0, 0)));
//			control.root.getChildren().add(i);
		}
	}

	private void initConsoleRender(Controller control, World world)
	{
		// creating matrixes to help with console printing
		char[][] tileGrid = new char[world.getDimensionX()][world
				.getDimensionY()];
		char[][] terrainGrid = new char[world.getDimensionX()][world
				.getDimensionY()];
		char[][] terrainEntityGrid = new char[world.getDimensionX()][world
				.getDimensionY()];
		char[][] unitGrid = new char[world.getDimensionX()][world
				.getDimensionY()];
		char[][] triggerGrid = new char[world.getDimensionX()][world
				.getDimensionY()];
		for (Tile t : world.getTiles())
		{
			tileGrid[t.getPos().x][t.getPos().y] = t.toChar();
			terrainGrid[t.getPos().x][t.getPos().y] = t.getTerrain().toChar();
			terrainEntityGrid[t.getPos().x][t.getPos().y] = t.getTerrain()
					.getEntity().toChar();
		}
		for (Unit u : world.getUnits())
		{
			if (u.getSelection() != null)
			{
				unitGrid[u.getTile().getPos().x][u.getTile().getPos().y] = u
						.toCharSelected();
			} else
			{
				unitGrid[u.getTile().getPos().x][u.getTile().getPos().y] = u
						.toChar();
			}

		}
		for (Trigger t : world.getTriggers())
		{
			triggerGrid[t.getRoot().x][t.getRoot().y] = t.toChar();
		}

		// use matrixes to print result
		String sTile = "\nTiles:\n", sTerr = "\nTerrains:\n", sTeEn = "\nTerrainEntities:\n", sUnit = "\nUnits:\n", sTrig = "\nTriggers:\n";
		for (int j = 0; j < world.getDimensionX(); j++)
		{
			for (int i = 0; i < world.getDimensionY(); i++)
			{
				// tile layer
				sTile += "[" + tileGrid[i][j] + "]";
				sTerr += "[" + terrainGrid[i][j] + "]";
				sTeEn += "[" + terrainEntityGrid[i][j] + "]";
				sUnit += "[" + unitGrid[i][j] + "]";
				sTrig += "[" + triggerGrid[i][j] + "]";
			}
			sTile += "\n";
			sTerr += "\n";
			sTeEn += "\n";
			sUnit += "\n";
			sTrig += "\n";
		}
		System.out.println(control.iteration);
		System.out.print(/* sTile + sTerr + sTeEn + */sUnit/* + sTrig */);
		System.out.println("----------------------------------");

	}

	public void update()
	{
		// TODO Auto-generated method stub

	}
}
