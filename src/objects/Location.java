package objects;

import java.util.Vector;

public class Location {

	private String m_roomTitle;
	private String m_roomDescription;
	private Vector vec_roomExits;
	
	public Location() {
		m_roomTitle = new String();
		m_roomDescription = new String();
		vec_roomExits = new Vector();
	}
	
	public Location(String title) {
		m_roomTitle = title;
		m_roomDescription = new String();
		vec_roomExits = new Vector();
		
	}
	
	public Location(String title, String description) {
		m_roomTitle = title;
		m_roomDescription = description;
		vec_roomExits = new Vector();
		
	}
	
	public String toString() {
		return m_roomTitle;
		
	}
	
	public void AddExit(Exit exit) {
		vec_roomExits.addElement(exit);
	}
	
	public void RemoveExit(Exit exit) {
		if(vec_roomExits.contains(exit)) {
			vec_roomExits.removeElement(exit);
		}
	}
	
	
	public String get_roomTitle() {
		return m_roomTitle;
	}
	
	public void set_roomTitle(String roomTitle) {
		m_roomTitle = roomTitle;
	}
	
	public String get_roomDescription() {
		return m_roomDescription;
	}
	
	public void set_roomDescription(String roomDescription) {
		m_roomDescription = roomDescription;
	}
	
	public Vector get_roomExits() {
		return (Vector) vec_roomExits.clone();
	}

}
