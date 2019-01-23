
/**
 * classe pour simuler un Rectangle
 *  	h�rite de GeometricObject
 */
public class Rectangle extends GeometricObject {
	
	/**
	 * Largeur du rectangle
	 */
	private double width = 1.;
	
	/**
	 * longueur du rectangle
	 */
	private double length = 1.;
	
	/**
	 * Constructeur sans param�tre
	 */
	public Rectangle() {
		super();
	}

	/**
	 * Constructeur avec 2 param�tres
	 * @param width est la largeur du rectangle
	 * @param length est la longueur du rectangle
	 */
	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}
	
	/**
	 * Constructeur avec 4 param�tres
	 * @param width est la largeur du rectangle
	 * @param length est la longueur du rectangle
	 * @param color est la couleur
	 * @param filled indique si le rectangle colori� � l'int�rieur
	 */
	public Rectangle(double width, double length, String color, boolean filled) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}

	/**
	 * getter (pour lire) de la largeur
	 * @return la largeur
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * setter (pour �crire) la largeur
	 * @param width est la nouvelle largeur
	 */
	public void setWidth(double width) {
		this.width = width;
	}

	/**
	 * getter (pour lire) de la longueur
	 * @return la longueur
	 */
	public double getLength() {
		return length;
	}

	/**
	 * setter (pour �crire) la longueur
	 * @param length est la nouvelle longueur
	 */
	public void setLength(double length) {
		this.length = length;
	}
	
	/**
	 * calcule l'aire du rectangle (largeur * longueur)
	 * @return l'aire
	 */
	public double getArea() {
		return width * length;
	}
	
	/**
	 * calcule le p�rim�tre 2 * longueur + 2 * largeur
	 * @return le p�rim�tre
	 */
	public double getPerimeter() {
		return 2 * (width + length);
	}

	/* g�n�re une String avec les attributs de Rectangle
	 * @param version String des attributs de Rectangle
	 */
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", length=" + length + ", " + super.toString() + "]";
	}

}
