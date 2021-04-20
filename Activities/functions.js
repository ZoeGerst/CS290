//with function hoisting
console.log(square(8))
function square(x){
    return x * x
}

//assigned to a variable
console.log(cubed(2))
var cubed = function(x){
    return x * x * x;
}

