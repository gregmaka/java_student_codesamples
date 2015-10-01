// Greg Maka CIS163AA

public class Circle
	{
		private double radius;
		private double diameter;
		private double area;
		public Circle()
			{
				setRadius();
			}
		public void setRadius()
			{
				this.radius = 1;
				diameter = 2 * radius;
				area = Math.PI * radius * Math.pow(radius, 2);
			}
		public double getRadius()
			{
				return radius;
			}
		public double getDiameter()
			{
				return diameter;
			}
		public double getArea()
			{
				return area;
			}
	}