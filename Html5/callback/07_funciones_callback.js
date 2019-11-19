//4 MANERAS DE CREAR UNA FUNCION

//NOMENCLATURA TIPICA DE FUNCTION EN VARIABLE
  let suma=function(x,y){return x+y}
//NOMENCLATURA TIPICA DE FUNCTION
  function resta(x,y){return x-y}
//NOMBENCLATURA DE OBJETO FUNCTION
  let division=new Function("x","y","return x/y;");
//NOMENCLATURA DE FUNCION FLECHA
  let multiplicacion=(x,y)=> {return x*y}

  function coordenada(x,y){return "("+x+","+y+")";}