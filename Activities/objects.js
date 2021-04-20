function deepEqual(a, b){

    var aObject = 0;
    var bObject = 0;

    if(a == b){

        return true;
    }
    if(a == null || b == null){

        return false;
    }

    if(typeof(a) != "object" || typeof(b) != "object"){

        return false
    } 

    for(var objects in a){

        aObject += 1;
    }

    for(var objects in b){

        bObject += 1;
        if(!(objects in a) || !deepEqual(a[objects], b[objects])){

            return false;
        }
    }
    if(aObject == bObject){

        return true;
    }
    else{

        return false;
    }
}




let obj = {here: {is: "an"}, object: 2};
console.log(deepEqual(obj, obj));
// → true
console.log(deepEqual(obj, {here: 1, object: 2}));
// → false
console.log(deepEqual(obj, {here: {is: "an"}, object: 2}));
// → true