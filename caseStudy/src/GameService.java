import java.util.ArrayList;
import java.util.List;

public class GameService {
	private List<Game> gameList;
	
	public GameService() {
		gameList = new ArrayList<>();
		gameList.add(new Game("SnowBird","Danny",300));
		gameList.add(new Game("FreshFood","Ram",450));
		gameList.add(new Game("Batsman","Kate",400));
		gameList.add(new Game("Pokiman","Steeve",600));
		gameList.add(new Game("YammyTommy","Narayan",350));
	}
	
	public List<Game> viewAll() {
		return gameList;
	}
	
	public String authorSearch(String author) {
        for (Game game : gameList) {
            if (game.getAuthorName().equalsIgnoreCase(author)) {
                return "Game name: "+game.getGameName();
            }
        }
        return "NOT FOUND";
    }
}
