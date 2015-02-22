package objects;

public class Exit {

	public static final int undefined = 0;
	public static final int north = 1;
	public static final int south = 2;
	public static final int east = 3;
	public static final int west = 4;
	public static final int up = 5;
	public static final int down = 6;
	public static final int northeast = 7;
	public static final int northwest = 8;
	public static final int southeast = 9;
	public static final int southwest = 10;
	public static final int in = 11;
	public static final int out = 12;
	
	
	public static final String[] dirNames = {
		"undefined",
		"north", "south", "east", "west", 
		"up", "down",
		"northeast", "northwest",
		"southeast", "southwest",
		"in", "out"
	};
	
	public static final String[] shortDirNames = {
		"null",
		"n", "s", "e", "w", 
		"u", "d",
		"ne", "nw",
		"se", "sw",
		"i", "o"
	};
	
	private Location m_leadsTo = null;
	private int m_direction;
	
	private String m_directionName;
	private String m_shortDirectionName;
	
	public Exit() {
		m_direction = Exit.undefined;
		m_leadsTo = null;
		m_directionName = dirNames[undefined];
		m_shortDirectionName = shortDirNames[undefined];
	}
	
	public Exit(int direction, Location leadsTo) {
		m_direction = direction;
		
		if(direction <= dirNames.length) 
			m_directionName = dirNames[m_direction];
		if(direction <= shortDirNames.length)
			m_directionName = shortDirNames[m_direction];
		
		m_leadsTo = leadsTo;
	}

	public Location get_leadsTo() {
		return m_leadsTo;
	}

	public void set_leadsTo(Location leadsTo) {
		m_leadsTo = leadsTo;
	}

	public String get_directionName() {
		return m_directionName;
	}

	public void set_directionName(String dirName) {
		m_directionName = dirName;
	}

	public String get_shortDirectionName() {
		return m_shortDirectionName;
	}

	public void set_shortDirectionName(String shortName) {
		m_shortDirectionName = shortName;
	}
}
