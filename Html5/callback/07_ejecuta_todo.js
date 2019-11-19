let arrayA=[1,2,3,4,5];
let arrayB=[2,3,4,5,6];



let arraySumaAB= operarArrays(arrayA,arrayB,suma);
arrayEnTabla(arraySumaAB);

let arrayMultiplicaAB= operarArrays(arrayA,arrayB,multiplicacion);
arrayEnTabla(arrayMultiplicaAB);

let arrayDivideAB= operarArrays(arrayA,arrayB,division);
arrayEnTabla(arrayDivideAB);

let arrayRestaAB= operarArrays(arrayA,arrayB,resta);
arrayEnTabla(arrayRestaAB);

let arrayCoordenadaAB= operarArrays(arrayA,arrayB,coordenada);
arrayEnCoordenada(arrayCoordenadaAB);


function arrayEnTabla(array){

    let tabla="<table border=2><tr>";

        for (let index = 0; index < array.length; index++) {
            const element = array[index];
            
            tabla+="<td>&nbsp"+element+ "&nbsp</td>";

        }
        
        document.getElementById("contenido").innerHTML+= tabla+" </tr> </table>";
}
function arrayEnCoordenada(array){

    let tabla="<table border=2> <tr><td>Indice</td><td>Coordenada</td></tr>";

        for (let index = 0; index < array.length; index++) {
            const element = array[index];
            tabla+="<tr><td>&nbsp"+index+ "&nbsp</td>";
            tabla+="<td>&nbsp"+element+ "&nbsp</td></tr>";

        }
        
        document.getElementById("contenido").innerHTML+= tabla+"</table>";
}

