package bsk;

public class Stringjet {
	public String merrStringun(long nr) {
		if (nr <= 10)
			return new Numrat().merrNumerin(nr);
		else if (nr < 100)
			return deriNjeqind(nr);
		else if (nr < 1000)
			return deriNjeMije(nr);
		else if (nr < 10000)
			return deriDhjeteMije(nr);
		else if (nr < 100000)
			return deriNjeQindMije(nr);
		else if (nr < 1000000)
			return deriNjeMilion(nr);
		else if (nr < 10000000)
			return deriDhjeteMilion(nr);
		else if (nr < 100000000)
			return deriNjeQindMilion(nr);
		else if (nr < 1000000000)
			return deriNjeMiliard(nr);
		else if (nr < 10000000000L)
			return deriDhjeteMiliard(nr);
		else if (nr < 100000000000L)
			return deriNjeQindMiliard(nr);
		else if (nr < 1000000000000L)
			return deriNjeTrilion(nr);
		else if (nr < 10000000000000L)
			return deriDhjeteTrilion(nr);
		else if (nr < 100000000000000L)
			return deriNjeQindTrilion(nr);
		else if (nr < 1000000000000000L)
			return deriNjeKuadrilion(nr);
		else if (nr < 10000000000000000L)
			return deriDhjeteKuadrilion(nr);
		else if (nr < 100000000000000000L)
			return deriNjeQindKuadrilion(nr);
		else if (nr < 1000000000000000000L)
			return deriQetu(nr);
		return "Error: Numri shume i madh";
	}

	private String deriNjeqind(long nr) {
		int nr1 = new Integer("" + ("" + nr).charAt(0)).intValue();
		int nr2 = new Integer("" + ("" + nr).charAt(1)).intValue();
		if (nr < 20)
			return merrStringun(new Integer("" + ("" + nr).charAt(1)).intValue()) + "mbëdhjetë";
		else if (nr >= 20 & nr < 30) {
			if (nr % 10 == 0)
				return "njëzet";
			else
				return "njëzet e " + merrStringun(nr2);
		} else {
			if (nr % 10 == 0)
				return merrStringun(nr1) + "dhjetë";
			else
				return merrStringun(nr1) + "dhjetë e " + merrStringun(nr2);
		}
	}

	private String deriNjeMije(long nr) {
		int nr1 = new Integer("" + ("" + nr).charAt(0)).intValue();
		if (nr % 100 == 0)
			return merrStringun(nr1) + "qindë";
		else
			return merrStringun(nr1) + "qindë e " + merrStringun(nr % 100);
	}

	private String deriDhjeteMije(long nr) {
		int nr1 = new Integer("" + ("" + nr).charAt(0)).intValue();
		if (nr % 1000 == 0)
			return merrStringun(nr1) + "mijë";
		else
			return merrStringun(nr1) + "mijë e " + merrStringun(nr % 1000);
	}

	private String deriNjeQindMije(long nr) {
		int nr1 = new Integer("" + ("" + nr).charAt(0)).intValue();
		int nr2 = new Integer("" + ("" + nr).charAt(1)).intValue();
		if (nr % 1000 == 0)
			return merrStringun(new Integer(nr1 + "" + nr2).intValue()) + "mijë";
		else
			return merrStringun(new Integer(nr1 + "" + nr2).intValue()) + "mijë e " + merrStringun(nr % 1000);
	}

	private String deriNjeMilion(long nr) {
		int nr1 = new Integer("" + ("" + nr).charAt(0)).intValue();
		int nr2 = new Integer("" + ("" + nr).charAt(1)).intValue();
		int nr3 = new Integer("" + ("" + nr).charAt(2)).intValue();
		if (nr % 1000 == 0)
			return merrStringun(new Integer(nr1 + "" + nr2 + "" + nr3).intValue()) + "mijë";
		else
			return merrStringun(new Integer(nr1 + "" + nr2 + "" + nr3).intValue()) + "mijë e "
					+ merrStringun(nr % 1000);
	}

	private String deriDhjeteMilion(long nr) {
		int nr1 = new Integer("" + ("" + nr).charAt(0)).intValue();
		if (nr % 1000000 == 0)
			return merrStringun(nr1) + "milion";
		else
			return merrStringun(nr1) + "milion e " + merrStringun(nr % 1000000);
	}

	private String deriNjeQindMilion(long nr) {
		int nr1 = new Integer("" + ("" + nr).charAt(0)).intValue();
		int nr2 = new Integer("" + ("" + nr).charAt(1)).intValue();
		if (nr % 1000000 == 0)
			return merrStringun(new Integer(nr1 + "" + nr2).intValue()) + "milion";
		else
			return merrStringun(new Integer(nr1 + "" + nr2).intValue()) + "milion e " + merrStringun(nr % 1000000);
	}

	private String deriNjeMiliard(long nr) {
		int nr1 = new Integer("" + ("" + nr).charAt(0)).intValue();
		int nr2 = new Integer("" + ("" + nr).charAt(1)).intValue();
		int nr3 = new Integer("" + ("" + nr).charAt(2)).intValue();
		if (nr % 1000000 == 0)
			return merrStringun(new Integer(nr1 + "" + nr2 + "" + nr3).intValue()) + "milion";
		else
			return merrStringun(new Integer(nr1 + "" + nr2 + "" + nr3).intValue()) + "milion e "
					+ merrStringun(nr % 1000000);
	}

	private String deriDhjeteMiliard(long nr) {
		int nr1 = new Integer("" + ("" + nr).charAt(0)).intValue();
		if (nr % 1000000000 == 0)
			return merrStringun(nr1) + "miliard";
		else
			return merrStringun(nr1) + "miliard e " + merrStringun(nr % 1000000000);
	}

	private String deriNjeQindMiliard(long nr) {
		int nr1 = new Integer("" + ("" + nr).charAt(0)).intValue();
		int nr2 = new Integer("" + ("" + nr).charAt(1)).intValue();
		if (nr % 1000000000 == 0)
			return merrStringun(new Integer(nr1 + "" + nr2).intValue()) + "miliard";
		else
			return merrStringun(new Integer(nr1 + "" + nr2).intValue()) + "miliard e " + merrStringun(nr % 1000000000);
	}

	private String deriNjeTrilion(long nr) {
		int nr1 = new Integer("" + ("" + nr).charAt(0)).intValue();
		int nr2 = new Integer("" + ("" + nr).charAt(1)).intValue();
		int nr3 = new Integer("" + ("" + nr).charAt(2)).intValue();
		if (nr % 1000000000 == 0)
			return merrStringun(new Integer(nr1 + "" + nr2 + "" + nr3).intValue()) + "miliard";
		else
			return merrStringun(new Integer(nr1 + "" + nr2 + "" + nr3).intValue()) + "miliard e "
					+ merrStringun(nr % 1000000000);
	}

	private String deriDhjeteTrilion(long nr) {
		int nr1 = new Integer("" + ("" + nr).charAt(0)).intValue();
		if (nr % 1000000000000L == 0)
			return merrStringun(nr1) + "trilion";
		else
			return merrStringun(nr1) + "trilion e " + merrStringun(nr % 1000000000000L);
	}

	private String deriNjeQindTrilion(long nr) {
		int nr1 = new Integer("" + ("" + nr).charAt(0)).intValue();
		int nr2 = new Integer("" + ("" + nr).charAt(1)).intValue();
		if (nr % 1000000000000L == 0)
			return merrStringun(new Integer(nr1 + "" + nr2).intValue()) + "trilion";
		else
			return merrStringun(new Integer(nr1 + "" + nr2).intValue()) + "trilion e "
					+ merrStringun(nr % 1000000000000L);
	}

	private String deriNjeKuadrilion(long nr) {
		int nr1 = new Integer("" + ("" + nr).charAt(0)).intValue();
		int nr2 = new Integer("" + ("" + nr).charAt(1)).intValue();
		int nr3 = new Integer("" + ("" + nr).charAt(2)).intValue();
		if (nr % 1000000000000L == 0)
			return merrStringun(new Integer(nr1 + "" + nr2 + "" + nr3).intValue()) + "trilion";
		else
			return merrStringun(new Integer(nr1 + "" + nr2 + "" + nr3).intValue()) + "trilion e "
					+ merrStringun(nr % 1000000000000L);
	}

	private String deriDhjeteKuadrilion(long nr) {
		int nr1 = new Integer("" + ("" + nr).charAt(0)).intValue();
		if (nr % 1000000000000000L == 0)
			return merrStringun(nr1) + "kuadrilion";
		else
			return merrStringun(nr1) + "kuadrilion e " + merrStringun(nr % 1000000000000000L);
	}

	private String deriNjeQindKuadrilion(long nr) {
		int nr1 = new Integer("" + ("" + nr).charAt(0)).intValue();
		int nr2 = new Integer("" + ("" + nr).charAt(1)).intValue();
		if (nr % 1000000000000000L == 0)
			return merrStringun(new Integer(nr1 + "" + nr2).intValue()) + "kuadrilion";
		else
			return merrStringun(new Integer(nr1 + "" + nr2).intValue()) + "kuadrilion e "
					+ merrStringun(nr % 1000000000000000L);
	}

	private String deriQetu(long nr) {
		int nr1 = new Integer("" + ("" + nr).charAt(0)).intValue();
		int nr2 = new Integer("" + ("" + nr).charAt(1)).intValue();
		int nr3 = new Integer("" + ("" + nr).charAt(2)).intValue();
		if (nr % 1000000000000000L == 0)
			return merrStringun(new Integer(nr1 + "" + nr2 + "" + nr3).intValue()) + "kuadrilion";
		else
			return merrStringun(new Integer(nr1 + "" + nr2 + "" + nr3).intValue()) + "kuadrilion e "
					+ merrStringun(nr % 1000000000000000L);
	}
}