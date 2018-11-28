package at.ac.tuwien.ec.sleipnir;

import org.apache.commons.lang.math.RandomUtils;

import at.ac.tuwien.ec.model.Hardware;
import at.ac.tuwien.ec.model.HardwareCapabilities;
import at.ac.tuwien.ec.model.infrastructure.energy.AMDCPUEnergyModel;
import at.ac.tuwien.ec.model.infrastructure.energy.CPUEnergyModel;
import at.ac.tuwien.ec.model.infrastructure.energy.Mobile3GNETEnergyModel;
import at.ac.tuwien.ec.model.infrastructure.energy.NETEnergyModel;
import at.ac.tuwien.ec.model.infrastructure.energy.SamsungS2DualEnergyModel;
import at.ac.tuwien.ec.model.pricing.EdgePricingModel;

public class SimulationSetup {
	
	public static void readFromFile(String url){
		
	}
	
	public static RandomUtils rand = new RandomUtils();
	public static int MAP_M = 2;
	public static int MAP_N = 2;
	public static int cloudMaxHops = 10;
	public static int cloudCoreNum = 128;
	public static double cloudRam = 256;
	public static double cloudStorage = 5000;
	public static int cloudMipsPerCore = 64000;
	public static int edgeCoreNum = 16;
	public static double edgeRam = 128;
	public static double edgeStorage = 1000;
	public static double edgeMipsPerCore = 8000;
	public static EdgePricingModel edgePricingModel = new EdgePricingModel();
	public static CPUEnergyModel edgeCPUEnergyModel = new AMDCPUEnergyModel();
	public static int mobileNum = 1;
	public static double mobileEnergyBudget = 10000;
	public static HardwareCapabilities defaultMobileDeviceHardwareCapabilities = 
			new HardwareCapabilities(new Hardware(2,16,(int)16e10),600);
	public static CPUEnergyModel defaultMobileDeviceCPUModel = new SamsungS2DualEnergyModel();
	public static NETEnergyModel defaultMobileDeviceNETModel = new Mobile3GNETEnergyModel();
	public static double wifiAvailableProbability;
	public static HardwareCapabilities defaultEdgeNodeCapabilities = new HardwareCapabilities(
			new Hardware(SimulationSetup.edgeCoreNum,
			SimulationSetup.edgeRam,
			SimulationSetup.edgeStorage),
			SimulationSetup.edgeMipsPerCore);
	public static HardwareCapabilities defaultCloudCapabilities = new HardwareCapabilities(
			new Hardware(SimulationSetup.cloudCoreNum,
			SimulationSetup.cloudRam,
			SimulationSetup.cloudStorage),
			SimulationSetup.cloudMipsPerCore);
	public static double antivirusFileSize;
	public static double task_multiplier = 500;
	public static int lambdaLatency;
	public static int chessMovesNum = 1;
	public static double chess_mi;
	public static double facebookImageSize;
	public static double facerecImageSize;
	public static double navigatorMapSize;
	public static String[] algorithms;
	public static boolean batch;
	public static double batteryCapacity = mobileEnergyBudget;
	public static int iterations = 5;

}
