package controller;

import java.awt.Point;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

import controller.Input;
import actions.Moving;
import unit.Unit;
import view.Render;
import world.World;
import world.WorldLoader;
import javafx.application.Platform;
import javafx.concurrent.Service;
import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Controller implements Initializable
{
	@FXML
	public BorderPane root;

	@FXML
	public PerspectiveCamera perCam;

	@FXML
	public Label play;

	public int iteration;
	@SuppressWarnings("unused")
	private Input input;
	private Timer timer;
	private Updater updater;
	private World world;
	private Renderer renderer;
	@SuppressWarnings("unused")
	private Scanner scan;
	private Render worldRender;
	public static final long TICK_LENGTH = /* 17 */1000;

	@Override
	public void initialize(URL location, ResourceBundle resources)
	{
		// temporary code to test the in-game

		input = new Input(this, root);
		scan = new Scanner(System.in);
		iteration = 0;
	}

	public void start() throws IOException
	{
		// FXML

		Stage stage = (Stage) play.getScene().getWindow();

		root = (BorderPane) FXMLLoader.load(getClass().getResource(
				"inGame.fxml"));

		Scene scene = new Scene(root);
		scene.getStylesheets().add(
				getClass().getResource("application.css").toExternalForm());
		input = new Input(this, root);

		stage.setScene(scene);

		perCam = new PerspectiveCamera();
		scene.setCamera(perCam);

		// generate world

		world = new World(10, 10);
		//WorldLoader.load("");
		world.startTestWorld();
		worldRender = new Render(this, world, true);
		root.requestFocus();
		
		
		//give an order to a duck
		
//		world.getPlayer("Player1").select(world.getUnit(world.getTile(1, 0).getPos()));
//		((Moving) world.getPlayer("Player1").getSelection().get(0)).move(8, 8);

		// update world

		if (timer == null)
		{
			timer = new Timer();
			updater = new Updater();
			renderer = new Renderer();

			timer.start();
		}
	}

	private class Timer extends Service<Void>
	{

		boolean run = true;

		public Timer()
		{
		}

		@Override
		protected Task<Void> createTask()
		{
			return new Task<Void>()
			{

				protected Void call() throws Exception
				{
					while (run)
					{
						Platform.runLater(() ->
						{
							if (!renderer.isRunning())
							{
								renderer.cancel();
								renderer.reset();
								renderer.start();
							}

							if (!updater.isRunning())
							{
								updater.cancel();
								updater.reset();
								updater.start();
							}
						});
						try
						{
							Thread.sleep(TICK_LENGTH);
						} catch (InterruptedException e)
						{
							e.printStackTrace();
						}
					}
					return null;
				}

			};
		}
	}

	private class Updater extends Service<Void>
	{
		protected Task<Void> createTask()
		{
			return new Task<Void>()
			{

				protected Void call() throws Exception
				{
					Platform.runLater(() ->
					{
						// String com = "";
						update();
						// com = scan.nextLine();

						// readCommand(com);

						iteration++;
					});
					return null;
				}

			};
		}
	}

	private class Renderer extends Service<Void>
	{
		@Override
		protected Task<Void> createTask()
		{
			return new Task<Void>()
			{
				protected Void call() throws Exception
				{
					Platform.runLater(() ->
					{
						render();
					});

					return null;
				}

			};
		}
	}

	/**
	 * will print in console a representation of the world
	 */
	private void render()
	{
		worldRender.update();

	}

	private void update()
	{
		world.update();
		// testBox.setRotate(testBox.getRotate() + 1.0);
	}

	public void readCommand(String com)
	{
		// first step: split the command
		String[] token = com.split(" ");
		if (token[0].equals("select"))
		{
			if (token[1].equals("duck"))
			{
				world.getPlayer("Player1").select(world.getUnit(new Point(0, 1)));
			}
		} else if (token[0].equals("move"))
		{
			if (token[1].equals("selection"))
			{
				for (Unit u : world.getPlayer("Player1").getSelection())
				{
					if (u instanceof Moving)
					{
						((Moving) u).move(Integer.parseInt(token[2]),
								Integer.parseInt(token[3]));
					}
				}
			}
		}

	}

	public World getWorld()
	{
		return world;
	}

	@FXML
	public void play()
	{
		try
		{
			start();
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	@FXML
	public void option()
	{

	}

	@FXML
	public void quit()
	{
		System.exit(0);
	}
}
