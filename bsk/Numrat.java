package bsk;

public class Numrat {
	public String merrNumerin(long nr) {
		if (nr == 1)
			return "një";
		else if (nr == 2)
			return "dy";
		else if (nr == 3)
			return "tre";
		else if (nr == 4)
			return "katër";
		else if (nr == 5)
			return "pesë";
		else if (nr == 6)
			return "gjashtë";
		else if (nr == 7)
			return "shtatë";
		else if (nr == 8)
			return "tetë";
		else if (nr == 9)
			return "nëntë";
		else if (nr == 10)
			return "dhjetë";
		return "zero";
	}
}
