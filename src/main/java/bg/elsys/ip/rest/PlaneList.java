package bg.elsys.ip.rest;

import java.util.ArrayList;
import java.util.List;

/**
 * Singleton class for storing our list of planes
 * @author Lachezar Ivanov
 * @version 1.0
 */
public class PlaneList {
	private static PlaneList instance = new PlaneList();
	private List<Plane> planeList = new ArrayList<>();
	
	private PlaneList() {
		planeList.add(new Plane("ICON A5", "Rotax 912", 2, 684, 27, 176));
		planeList.add(new Plane("ICON A6", "Rotax 912", 2, 684, 27, 176));
		planeList.add(new Plane("ICON A7", "Rotax 912", 2, 684, 27, 176));
		planeList.add(new Plane("ICON A8", "Rotax 912", 2, 684, 27, 176));
		planeList.add(new Plane("ICON A9", "Rotax 912", 2, 684, 27, 176));
	}

	
	public static PlaneList getInstance () {
		return instance;
	}

	
	public List<Plane> getPlaneList() {
		return planeList;
	}
	
	
	public void setPlaneList(List<Plane> planeList) {
		this.planeList = planeList;
	}
}
