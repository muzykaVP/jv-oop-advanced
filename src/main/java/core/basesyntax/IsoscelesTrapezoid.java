package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private static final FigureShape shape = FigureShape.ISOSCELES_TRAPEZOID;
    private final double lowerSide;
    private final double upperSide;
    private final double height;

    public IsoscelesTrapezoid(double lowerSide, double upperSide, double height, String color) {
        super(color, shape.name());
        this.lowerSide = lowerSide;
        this.upperSide = upperSide;
        this.height = height;
    }

    @Override
    public String drawFigure() {
        return String.format("Figure: %s, area: %f sq.units, "
                        + "lowerSide: %f units, upperSide: %f units, height: %f units, color: %s",
                shape.name().toLowerCase(), getArea(), lowerSide, upperSide, height, getColor());
    }

    @Override
    public double getArea() {
        return ((lowerSide + upperSide) / 2) * height;
    }
}