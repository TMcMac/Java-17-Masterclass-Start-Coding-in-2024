import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Mappable> mappables = new ArrayList<>();

        mappables.add(new Building("TransAmerica Pyramid", UsageType.COMMERCIAL));
        mappables.add(new Building("SalesForce Tower", UsageType.COMMERCIAL));
        mappables.add(new Building("Millennium Building", UsageType.RESIDENTIAL));
        mappables.add(new Building("Chase Center", UsageType.SPORTS));
        mappables.add(new Building("Oracle Park", UsageType.SPORTS));
        mappables.add(new Building("City Hall", UsageType.GOVERNMENT));
        mappables.add(new Building("United Nations", UsageType.GOVERNMENT));

        mappables.add(new UtilityLine("Liberty Street Water Main", UtilityType.WATER));
        mappables.add(new UtilityLine("Sonic Fiber", UtilityType.FIBER_OPTIC));

        for (var m : mappables) {
            Mappable.mapIt(m);
        }
    }
}
