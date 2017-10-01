package ua.mega.Lambda_Expression.ex02_With_Lambda_Expression;

@FunctionalInterface // It is optional
interface Drawable{
    public void draw();
}

public class LambdaExpressionExample {
    public static void main(String[] args) {
        int width = 10;

        // with lambda
        Drawable d2 = () -> {
            System.out.println("Drawing " + width);
        };
        d2.draw();
    }
}
