var divBis =document.getElementById("contenido_bis");
divBis.style="background-color:lightgrey";

var mostrarTodosParam=function(primerParam){

    divBis.innerHTML+="<p>Primer parametro: "+primerParam+" </p>"
    for (argumento of arguments) {

        divBis.innerHTML+="Argumento: "+argumento+" </br>";
        
    }
if(typeof(primerParam)==="undefined"){

divBis.innerHTML+="primeraParam no esta definido </br>";


}

if(primerParam=="1"){
divBis.innerHTML+="Pues es parecido a \"1\"";

}

else {
    divBis.innerHTML+="No es parecido a \"1\"";
    
    }

if(primerParam==="1"){
        divBis.innerHTML+="Pues es identico \"1\"";
        
        }
        
else {
        divBis.innerHTML+="No es identico a \"1\"";
            
            }

}

mostrarTodosParam("Un parametro",50,true,bebida["propiedades"]);
mostrarTodosParam();
mostrarTodosParam("1");//LE PASAMOS UN TEXTO COMO 1
mostrarTodosParam(1);// LE PASAMOS UN VALOR DE TIPO, NUMBER 1

var intentoConversion=parseFloat("veinte");

divBis.innerHTML+=" </br>Convirtiendo.Resultado = "+intentoConversion;
divBis.innerHTML+=" </br>El tipo de dato es: "+typeof(intentoConversion);


if(isNaN(intentoConversion)){

divBis.innerHTML+="</br> No es un numero";

}
divBis.innerHTML+="</br> Infinito: "+1/0;
divBis.innerHTML+="</br> Valor max: "+1.234567890123456789;//PRECISION DE DOUBLE PARECE