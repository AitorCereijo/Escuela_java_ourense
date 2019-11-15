
var div=document.getElementById("contenido");

var bebida=new Object();

bebida.tipo="Cerveza";
bebida.cantidad="3 litros";

div.innerHTML+= "Bebida es "+bebida.tipo + "<br/>";

//EN JS LOS OBJETOS SON MAPAS(COMO EL HASHMAP DE JAVA)


div.innerHTML+= "Bebida es "+bebida["cantidad"] + "<br/>";

bebida["propiedades"]="Tiene alcohol, gas y emborracha.";

div.innerHTML+="<br/> Propiedades: "+bebida.propiedades;

function suma(x,y){

return x+y;

}

div.innerHTML+= "<br/> suma(5,3)= " +suma(5,3);
div.innerHTML+= "<br/> suma(5,3)= " +suma('5','3');

//PARA HACER UNA ESPECIE DE CLASE, SOLO CREAMOS UNA FUNCION CONSTRUCTORA

function Bebida(tipo,cant,prop){

this.tipo=tipo;
this.cantidad=cant;
this.propiedades=prop;

    function funMostrar(){

    div.innerHTML+="<p> Bebida: "+this.tipo+ " Cantidad: "+this.cantidad+ " Propiedades: "+this.propiedades;


    }

    this.mostrar=funMostrar

}

var zumo=new Bebida("zumo de naranja","1 litro", "Vitamina C");
zumo.mostrar();