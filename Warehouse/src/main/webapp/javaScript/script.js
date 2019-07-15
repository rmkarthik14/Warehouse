function hideNav() {
	 var x = document.getElementById("add"); 
	 var y = document.getElementById("view");
	 var z = document.getElementById("delete"); 
	    y.style.display = "none";
	    z.style.display = "none";
	    x.style.display = "block";
}

function hideView() {
	var y = document.getElementById("view");
	var z = document.getElementById("delete");
	var x = document.getElementById("add");
	    x.style.display = "none";
	    z.style.display = "none";
	    y.style.display = "block";
	}

function hideDelete() {
	  var z = document.getElementById("delete");
	  var x = document.getElementById("add");
	  var y = document.getElementById("view");
	    x.style.display = "none";
	    y.style.display = "none";
	    z.style.display = "block";
	  
	}

function hideloc() {
	 var x = document.getElementById("location"); 
	 var y = document.getElementById("productLocation");
	 var z = document.getElementById("getLocation"); 
	    y.style.display = "none";
	    z.style.display = "none";
	    x.style.display = "block";
}

function hideprodloc() {
	var y = document.getElementById("productLocation");
	var z = document.getElementById("getLocation");
	var x = document.getElementById("location");
	    x.style.display = "none";
	    z.style.display = "none";
	    y.style.display = "block";
	}

function hidegetloc() {
	  var z = document.getElementById("getLocation");
	  var x = document.getElementById("location");
	  var y = document.getElementById("productLocation");
	    x.style.display = "none";
	    y.style.display = "none";
	    z.style.display = "block";
	  
	}

function searchProducts() {
	  var input, filter, table, tr, td, i, txtValue;
	  
	  input = document.getElementById("myInput");
	  filter = input.value.toUpperCase();
	  table = document.getElementById("Pdisplay");
	  tr = table.getElementsByTagName("tr");
	  
	  for (i = 0; i < tr.length; i++) {
	    td = tr[i].getElementsByTagName("td")[1];
	    if (td) {
	      txtValue = td.textContent || td.innerText;
	      if (txtValue.toUpperCase().indexOf(filter) > -1) {
	        tr[i].style.display = "";
	      } else {
	        tr[i].style.display = "none";
	      }
	    }       
	  }
	}