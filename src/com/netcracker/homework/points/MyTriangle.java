package com.netcracker.homework.points;

/**
 * @author Lalykin Kirill
 */
public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(int x1,int y1,int x2,int y2,int x3, int y3){
        v1 = new MyPoint(x1,y1);
        v2 = new MyPoint(x2,y2);
        v3 = new MyPoint(x3,y3);
        new MyTriangle(v1,v2,v3);
    }
    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public String toString() {
        return "MyTriangle{" +
                "v1=" + v1.toString() +
                ", v2=" + v2.toString() +
                ", v3=" + v3.toString() +
                '}';
    }
    public double getPerimeter(){
        return this.v1.distance(this.v2)+ this.v2.distance(this.v3)+this.v3.distance(this.v1);
    }
    public String getType(){
        String ans = "";
        double a = v1.distance(v2);
        double b = v2.distance(v3);
        double c = v3.distance(v1);
        if(a == b && b == c){
            return "Equilateral";
        }else if(a == b){
            return "Isosceles";
        }else{
            return "Scalene";
        }
    }
}
