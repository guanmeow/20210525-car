package test;

public abstract class Box {
    int leight;
    int width;
    int height;

    public boolean vaidate(int a , int b, int c) {
        return(a<= leight && b<= width && c <= height);
    }

    public abstract String getName();
    public abstract int getPrice();
}
