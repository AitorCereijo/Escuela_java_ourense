function operarArrays(arrX,arrY,opera){
    //COMPROBAMOS QUE EL TAMAÑO DE LOS ARRAY SON EL MISMO
    
        if(arrX.length == arrY.length){
            //DECLARAMOS UN ARRAY CON LA PALABRA VAR: TIENE AMBITO DE FUNCION
            //A DIFERENCIA DE LET DE ES6, QUE SI ES AMBITO A NIVEL DE BLOQUE
            var arrayResultado= new Array();
            
            for(let i=0; i<arrX.length;i++){
    
              arrayResultado[i]=opera(arrX[i],arrY[i]);
    
            }
    
        }
          return arrayResultado;
    }
    
    
    
    //EJEMPLOS ARRAY
    
      //var arrayEjemplo= new Array(); UNA MANERA DE CREAR ARRAY
      var arrayEjemplo=[]; //OTRA MANERA, NO INDICAMOS EL TAMAÑO PORQUE EN 
      //REALIDAD LOS ARRAY DE JS SON COMO ARRAYLIST<OBJECT>
    
    arrayEjemplo.push("Primer elemento");
    arrayEjemplo[10]="lo que sea";