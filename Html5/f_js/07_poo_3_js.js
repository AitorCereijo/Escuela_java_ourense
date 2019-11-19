//NOTACION JSON:JAVASCRIPT OBJECT NOTATION
//LO QUE SE PUEDE ALMACENAR EN XML, SE PUEDE CONVERTIR A JSON Y VICIEVERSA
//TODO SE PUEDE ALMACENAR COMO JASON

var divTris =document.getElementById("contenido_tris");
var unObjeto = {};// ES IGUAL QUE HACER ->  new Object();

var otroObjecto ={

    "prop_1": "Propiedad uno",
    "prop_2": "Propiedad dos",
    "prop_3": "Propiedad tres",
    prop_4 :"Propiedad cuatro",

        toStringAll: function() {

        var str="Lista de propiedades </br>";

        for (var i=0;i<10;i++) {

            if(typeof(this["prop_"+i])!=="undefined"){

                    str += this["prop_"+i] +";  ";
                }
                
                     return str;                     
        }
    
    }
    
}

otroObjecto.prop_5 = "Propiedad cinco";

divTris.innerHTML += "</br>"+otroObjecto.toStringAll();

