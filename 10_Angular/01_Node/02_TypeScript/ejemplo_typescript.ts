var lenguaje="JavaScript";

let textoExtra : String = "con tipado fuerte OPCIONAL ";
console.log("TypeScript es : "+lenguaje+" "+textoExtra);



class unaClase{
	
	private propiedad: String;
		
	constructor(private propiedad: String){
		
		this.propiedad=propiedad;
		
		
	}	
	public getPropiedad() : String {
		
		return this.propiedad;
		
	}
	
	
}
let unObjeto: UnaClase = new UnaClase("Tiene POO");
textoExtra = 2000;

console.log("Y "+unObjeto.getPropiedad());