/**
 * Simulation of a circle
 * 		h�rite de GeometricObjec
 */
public class Circle extends GeometricObject{
	
	/**
	 * rayon du cercle, valeur par d�faut
	 */
	private double radius = 1.;

    /**
     * Constructeur sans param�tre
     */
    public Circle() {
    }

    /**
     * Constructeur avec le rayon comme seul param�tre
     * @param radius est le rayon
     */
    public Circle(double radius) {
    	// this est la r�f�rence sur l'instance courante de Circle (l'objet courant)
        this.radius = radius;
    }

    /**
     * Constructeur avec 3 param�tres
     * @param radius est le rayon du cercle
     * @param color est la couleur du cercle
     * @param filled indique si le cercle est rempli
     */
    public Circle(double radius, String color, boolean filled) {
    	// super(color, filled) appelle le constructeur de la classe m�re: GeometricObject(color, filled)
        super(color, filled);
        // on pr�f�re appeler la fonction setRadius car elle contr�le si le rayon est correct
        setRadius(radius);
    }

    /**
     * 
     * @return le rayon du cercle
     */
    public double getRadius() {
        return radius;
    }

    /**
     * assigne une valeur au rayon
     * @param radius 
     * note: la m�thode est d�clar�e final car elle est utilis�e dans le constructeur
     * final indique que la m�thode ne peut pas �tre override (par une classe qui h�riterait de Circle)
     *      je sais, c'est compliqu� et optionnel, mais c'est aussi que serait �crit du code professionnel
     *          => retenez que parfois on d�clare des m�thodes "final",
     *          et cela veut dire que c'est la version finale de la m�thode
     */
    public final void setRadius(double radius) {
        this.radius =  Math.abs(radius);
    }
    
    /**
     * 
     * @return l'aire du cercle : PI * R^2
     */
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
    
    /**
     * 
     * @return le p�rim�tre du cercle : 2 * PI * R
     */
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    
    /**
     * 
     * @return le diam�tre du cercle : 2 * R
     */
    public double getDiameter() {
        return 2 * radius;
    }
}
