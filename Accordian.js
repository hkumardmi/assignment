var accord ={
			"mens":["Cloths", "Shoes", "Watches","Sunglass"],
			"womens":[ "Cloths", "Shoes", "Watches","Sunglass"],
			"kids":[ "Cloths", "Shoes", "Watches","Sunglass"],
			"electronics":[ "Tv", "AC", "Microwave","Washing Machine"],
			"furniture":[ "Beds", "Sofas", "Tables","Chairs"],
			"sports":[ "Cricket", "Football", "Hockey","basket ball"]
			};
function show(value){
	var div = document.getElementById('panel');

	div.innerHTML = ''
		 // if (div.style.display === "none") {
		 	var ul = document.createElement('ul');
			div.appendChild(ul);

   			 accord[value].forEach(myFunction);
					function myFunction(item, index) {
						var li=document.createElement('li');
						ul.appendChild(li);
						li.innerHTML=li.innerHTML + item;		
						}	
			div.style.display = "block";
			// } else {
   // 			 div.style.display = "none";
  	// 		}
}
function hide(){
	var div = document.getElementById('panel');
	div.style.display = "none";	
}