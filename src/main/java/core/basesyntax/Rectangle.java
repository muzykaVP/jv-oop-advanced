package core.basesyntax;

public class Rectangle extends Figure {
    private static final FigureShape shape = FigureShape.RECTANGLE;
    private final double length;
    private final double width;

    public Rectangle(double length, double width, String color) {
        super(color, shape.name());
        this.length = length;
        this.width = width;
    }

    @Override
    public String drawFigure() {
        return String.format("Figure: %s, area: %.2f sq.units, "
                        + "length: %.2f units, width: %.2f units, color: %s",
                shape.name().toLowerCase(), getArea(), length, width, getColor());
    }

    @Override
    public double getArea() {
        return 0;
    }
}
