package com.rakesh.functionalinterface.task2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.rakesh.functionalinterface.StringMatch;

public class CigaretteDAO {

	private Collection<String> types = new ArrayList();

	public CigaretteDAO() {

		this.types.add("SMALL");
		this.types.add("LIGHTS");
		this.types.add("BLACK");
		this.types.add("PLAYERS");

	}

	public boolean find(StringMatch match, String value) {
		Iterator<String> itrref = types.iterator();
		while (itrref.hasNext()) {

			String elements = itrref.next();

			if (match.evaluate(elements, value)) {
				return true;
			}
		}

		return false;

	}

}
