package lab_3;

import java.util.*;

import lab_3.Utils.Zones;

/**
 * 
 */
public class FedEx extends Carrier {

	HashMap<Double, Zones[]> tariffs;
	Double defaultRate = 0.43;
	Double foundTariff = null;

	/*
	 * Zone = 0.35 for IA, MT, OR and CA Zone = 0.30 for TX, and UT Zone = 0.55 for
	 * FL, MA and OH Zone = 0.43 for all others
	 */
	/**
	 * Default constructor
	 */
	public FedEx(String name) {
		super(name);
		tariffs = new HashMap<Double, Zones[]>();
		Zones[] rate035 = { Zones.IA, Zones.MT, Zones.OR, Zones.CA };
		Zones[] rate030 = { Zones.TX, Zones.UT };
		Zones[] rate055 = { Zones.FL, Zones.MA, Zones.OH };

		tariffs.put(0.35, rate035);
		tariffs.put(0.30, rate030);
		tariffs.put(0.55, rate055);
	}

	@Override
	public Double calcCost() {
		if (getPackageItem().getZone() != null) {
			tariffs.entrySet().stream().forEach(entry -> {
				if (Arrays.stream(entry.getValue()).filter(z -> z.equals(getPackageItem().getZone())).count() > 0) {
					this.foundTariff = entry.getKey();
				}
			});
		}

		return foundTariff == null ? defaultRate*getPackageItem().getWeight() : foundTariff*getPackageItem().getWeight();
	}

}