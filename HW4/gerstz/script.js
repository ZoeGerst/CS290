//Zoe Gerst
//CS 290
var createTable = function(){

    var row = 1;
    var col = 1;

    function designTable(design){

        var table = document.createElement('table');
        var rowCols = document.createElement('tbody');
        
        table.style.width = '100%';
        table.setAttribute('border', '1');

        for(var i = 0; i < 4; i++){

            var headers = document.createElement('tr');

            for(var j = 0; j < 4; j++){

                if(i == 4 && j == 4){

                    break;
                }

                else{

                    if(i == 0){

                        var topHeader = document.createElement('th');
                        topHeader.appendChild(document.createTextNode("Header " + (j + 1)));
                        headers.appendChild(topHeader);
                    }

                    else{

                        var numRows = document.createElement('td');
                        var nums = i + ", " + (j + 1);
                        numRows.appendChild(document.createTextNode(nums));
                        numRows.setAttribute('id', nums);

                        if (i == 1 && j == 0){

                            numRows.style.border = "thick solid";
                        }
                        headers.appendChild(numRows);
                    }
                }
            }
            rowCols.appendChild(headers);
        }
        table.appendChild(rowCols);
        document.body.appendChild(table);
        if(design){

            design();
        }
    }
    function createButtons(){

        var body = document.body;
        var buttons = ["Up, ", "Down, ", "Left, ", "Right, ", "Mark Cell"];
        for(var i = 0; i < buttons.length; i++){

            var newButton = document.createElement('newButton');
            newButton.appendChild(document.createTextNode(buttons[i]));
            body.appendChild(newButton);
            newButton.addEventListener("click", function(clickCell){

                if(clickCell.target.innerText != "Mark Cell"){

                    cellNums(clickCell.target.innerText);
                }
                else{

                    markCellButton();
                }
            });
        }
    }

    function markCellButton(){

        var markButton = document.getElementById(row + ", " + col);
        markButton.style["backgroundColor"] = "yellow";
    }
    function cellNums(buttonNames){

        var location = row + ", " + col;
        var currentLocation = document.getElementById(location);
        currentLocation.style.border = "solid";

        switch(buttonNames){

            case "Up, ":
                if(row != 1){
                    row = row - 1;
                }
                break;
            case "Down, ":
                if(row != 3){
                    row = row + 1;
                }
                break;
            case "Right, ":
                if(col != 4){
                    col = col + 1;
                }
                break;
            case "Left, ":
                if(col != 1){
                    col = col - 1;
                }
                break;
        }
        location = row + ", " + col;
        currentLocation = document.getElementById(location);
        currentLocation.style.border = "5px solid black"
    }

    
    designTable(createButtons);
};
createTable();