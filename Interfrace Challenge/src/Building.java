enum UsageType {ENTERTAINMENT, GOVERNMENT, RESIDENTIAL, SPORTS, COMMERCIAL}
public class Building implements Mappable{
    private String name;
    private UsageType usage;

    public Building(String name, UsageType usage) {
        this.name = name;
        this.usage = usage;
    }

    @Override
    public String getLabel() {
        return name + " (" + usage +")";
    }

    @Override
    public Geometry getShape() {
        return Geometry.POINT;
    }

    @Override
    public String getMarker() {
        return switch(usage) {
            case ENTERTAINMENT -> Color.GREEN + " " + pointMarker.TRIANGLE;
            case GOVERNMENT -> Color.RED + " " + pointMarker.STAR;
            case RESIDENTIAL -> Color.BLUE + " " + pointMarker.SQUARE;
            case COMMERCIAL -> Color.RED + " " + pointMarker.SQUARE;
            case SPORTS -> Color.ORANGE + " " + pointMarker.PUSH_PIN;
            default -> Color.BLACK + " " + pointMarker.CIRCLE;
        };
    }

    @Override
    public String toJSON() {
        return Mappable.super.toJSON() + """
                , "name": "%s", "usage": "%s" """.formatted(name, usage);
    }
}
