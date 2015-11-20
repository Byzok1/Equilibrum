package world;

import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import player.Player;
import player.Team;
import reciepe.Reciepe;
import ressource.Ressource;
import tile.Tile;
import trigger.Trigger;
import unit.Unit;

public class WorldLoader
{

	public static void saveWorld(World world) throws IOException
	{
		JSONObject jWorld = new JSONObject();

		JSONArray tiles = new JSONArray();
		JSONArray units = new JSONArray();
		JSONArray players = new JSONArray();
		JSONArray teams = new JSONArray();
		JSONArray triggers = new JSONArray();
		JSONArray reciepes = new JSONArray();
		JSONArray ressources = new JSONArray();

		tiles.add(world.getTiles());
		units.add(world.getUnits());
		players.add(world.getPlayers());
		teams.add(world.getTeams());
		triggers.add(world.getTriggers());
		reciepes.add(world.getReciepes());
		ressources.add(world.getRessources());

		jWorld.put("Name", world.getName());
		jWorld.put("DimX", world.getDimensionX());
		jWorld.put("DimY", world.getDimensionY());
		jWorld.put("tiles", tiles);
		jWorld.put("units", units);
		jWorld.put("players", players);
		jWorld.put("teams", teams);
		jWorld.put("triggers", triggers);
		jWorld.put("reciepes", reciepes);
		jWorld.put("ressources", ressources);
		//
		// JSONArray tiles = new JSONArray();
		// for (Tile t : world.getTiles())
		// {
		// tiles.add("Tile: " + t.getTerrain() + t.getPos() + t.getWorld());
		// }
		// obj.put("Tiles", tiles);
		//
		// JSONArray reciepes = new JSONArray();
		// for (Reciepe r : world.getReciepes())
		// {
		// reciepes.add("Reciepe: " + r.getProduct() + r.getRessourceList() +
		// r.getWorld());
		// }
		// obj.put("Reciepes", reciepes);
		//
		// JSONArray units = new JSONArray();
		// for (Unit u : world.getUnits())
		// {
		// units.add("Units: " /*+ not sure how I'm going to manage this for
		// now...*/ + u.getPosition() + u.getWorld());
		// }
		//
		//
		// JSONArray triggers = new JSONArray();
		// for (Trigger t : world.getTriggers())
		// {
		// triggers.add("Triggers: " + t.getClass().getName() + t.getRoot() +
		// t.get)
		// }
		//
		//
		// JSONArray ressources = new JSONArray();
		//
		// JSONArray players = new JSONArray();
		//
		// JSONArray teams = new JSONArray();

		// try-with-resources statement based on post comment below :)
		try (FileWriter file = new FileWriter("./worlds/" + world.getName()))
		{
			file.write(jWorld.toJSONString());
			System.out.println("Successfully Copied JSON Object to File...");
			System.out.println("\nJSON Object: " + jWorld);
		}
	}

	public static World openWorld(String URL)
	{
		World world = null;
		JSONParser parser = new JSONParser();

		try
		{

			Object obj = parser.parse(new FileReader(URL));

			JSONObject jsonObject = (JSONObject) obj;

			String name = (String) jsonObject.get("Name");
			String dimX = (String) jsonObject.get("DimX");
			String dimY = (String) jsonObject.get("DimY");
			JSONArray tiles = (JSONArray) jsonObject.get("tiles");
			JSONArray units = (JSONArray) jsonObject.get("units");
			JSONArray players = (JSONArray) jsonObject.get("players");
			JSONArray teams = (JSONArray) jsonObject.get("teams");
			JSONArray triggers = (JSONArray) jsonObject.get("triggers");
			JSONArray reciepes = (JSONArray) jsonObject.get("reciepes");
			JSONArray ressources = (JSONArray) jsonObject.get("ressources");

			world = new World(name, Integer.parseInt(dimX),
					Integer.parseInt(dimY), (ArrayList) reciepes,
					(ArrayList) tiles, (ArrayList) units,
					(ArrayList) ressources, (ArrayList) players,
					(ArrayList) teams, (ArrayList) triggers);

			System.out.println("Name: " + name);
			System.out.println("DimensionX: " + dimX);
			System.out.println("DimensionY: " + dimY);

			System.out.println("\nTiles:");
			Iterator<String> iterator = tiles.iterator();
			while (iterator.hasNext())
			{
				System.out.println(iterator.next());
			}

			System.out.println("\nPlayers:");
			iterator = players.iterator();
			while (iterator.hasNext())
			{
				System.out.println(iterator.next());
			}

			System.out.println("\nUnits:");
			iterator = units.iterator();
			while (iterator.hasNext())
			{
				System.out.println(iterator.next());
			}

			System.out.println("\nTeams:");
			iterator = teams.iterator();
			while (iterator.hasNext())
			{
				System.out.println(iterator.next());
			}

			System.out.println("\nRessources:");
			iterator = ressources.iterator();
			while (iterator.hasNext())
			{
				System.out.println(iterator.next());
			}

			System.out.println("\nTriggers:");
			iterator = triggers.iterator();
			while (iterator.hasNext())
			{
				System.out.println(iterator.next());
			}

			System.out.println("\nReciepes:");
			iterator = reciepes.iterator();
			while (iterator.hasNext())
			{
				System.out.println(iterator.next());
			}

		} catch (Exception e)
		{
			e.printStackTrace();
		}
		return world;
	}

}
