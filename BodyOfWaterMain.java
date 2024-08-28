public class BodyOfWaterMain {
//public static void main(String[] args) {
//BodyOfWater b = new BodyOfWater();
//System.out.println("here");
// }

public static void main(String[] args) {
BodyOfWater b = new BodyOfWater("Helen", 114, 11.4, false);
BodyOfWater b1 = new BodyOfWater("Jim", 514);

System.out.println(b.name());
System.out.println(b1.name());

System.out.println(b.largestDiameter());


System.out.println(b.avgDepth());
System.out.println(b1.avgDepth());

System.out.println(b.isSaltWater());

b.setName("12344321");
System.out.println(b.name());
}
}