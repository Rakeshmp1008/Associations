package com.rakesh.functionalinterface.lambda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AmusementParkDAO {

	List<AmusementParkDTO> listref = new ArrayList<AmusementParkDTO>();

	public AmusementParkDAO() {

		this.listref.add(new AmusementParkDTO("WONDERLA", "2000", "WATERGAMES"));
		this.listref.add(new AmusementParkDTO("FUNWORLD", "1000", "WATERGAMES"));
		this.listref.add(new AmusementParkDTO("GRS", "2500", "DRYGAMES"));

	}

	public AmusementParkDTO find(ParkFinder finder, AmusementParkDTO value) {
		Iterator<AmusementParkDTO> itrref = listref.iterator();
		while (itrref.hasNext()) {

			AmusementParkDTO element = itrref.next();
			AmusementParkDTO temp = finder.matching(element, value);
			{
				if (temp != null) {
					return element;
				}
				return null;
			}

		}
		return null;
	}
}
