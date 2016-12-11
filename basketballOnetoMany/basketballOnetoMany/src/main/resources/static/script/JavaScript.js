
var weekDayNameArray = ["Toronto Raptors vs. New York Knicks | December 05,2016	|10.30 PM", "New York Knicks vs. Los Angeles Lakers | December 10,2016	|10.30 PM", "Detroit Pistons vs. New York Knicks | November 01,2016	|07.30 PM", "New York Knicks vs. Houston Rockets | November 02,2016	|07.30 PM", "Chicago Bulls vs. New York Knicks | November 04,2016	|10.30 PM", "New York Knicks vs. Utah Jazz | November 06,2016	|10.30 PM", "New York Knicks vs. Brooklyn Nets | November 09,2016	|05.30 PM","Boston Celtics vs. New York Knicks | November 11,2016 |09.00 PM"];


function preventDefaultBehaviour(ev1) {
    "use strict";
    ev1.preventDefault();
}


function drag(ev2) {
    "use strict";
   

    ev2.dataTransfer.setData("dayName", ev2.target.innerHTML);
    ev2.dataTransfer.setData("sourceParentId", ev2.target.parentElement.id);
}

function drop(ev3) {
    "use strict";
   

    ev3 = ev3 || window.event;   
    var target = ev3.target || ev3.srcElement; 
    var dayName = ev3.dataTransfer.getData("dayName");

   
    if (dayName) {

        
        if (target.id === "") {
            target = target.parentElement;
        }

       
        var alreadyFound = false;

       
        var elementChildren = target.children;
        var i;
        for (i = 0; i < elementChildren.length; i += 1) {
            if (elementChildren[i].innerHTML === dayName) {
                alreadyFound = true;
            }
        }

       
        if (!alreadyFound && simulateDatabaseOperation() === true) {

           
            var newElement = document.createElement("li");
           
            newElement.innerHTML = dayName;
           
            newElement.draggable = true;

          
            var maxIndexForThisDay = getIndexForWeekDayName(dayName);
            var index;
            for (index = 0; index < elementChildren.length; index += 1) {
                if (getIndexForWeekDayName(elementChildren[index].innerHTML) > maxIndexForThisDay) {
                    break;
                }
            }
            if (index === elementChildren.length) {
            
                target.appendChild(newElement);
            } else {                
                target.insertBefore(newElement, target.childNodes[index]);
            }

           
            var sourceParentElementId = ev3.dataTransfer.getData("sourceParentId");
      
            var sourceParentElement = document.getElementById(sourceParentElementId);
           
            var indexForRemoval = getIndexForItemContent(dayName, sourceParentElement.children);
           
            sourceParentElement.removeChild(sourceParentElement.children[indexForRemoval]);
        } else if (alreadyFound) {
            alert(dayName + " already in the list!");
        }
    }

    ev3.dataTransfer.setData("dayName", null); 
    ev3 = null;
}



function getIndexForWeekDayName(weekDayName) {
    "use strict";
    return weekDayNameArray.indexOf(weekDayName);
}


function getIndexForItemContent(content, elementCollection) {
    "use strict";
    var i;
    for (i = 0; i < elementCollection.length; i += 1) {
        if (content === elementCollection[i].innerHTML) {
            return i;
        }
    }
    return null;
}


function testProbability(successRatio) {
    "use strict";
    return !!(successRatio > Math.random());
}


function simulateDatabaseOperation() {
    "use strict";
    if (testProbability(0.75)) {
        return true;
    } else {
        alert("Back-end busy 25% of the time. Please try again!");
        return false;
    }
}