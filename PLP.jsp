<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">
function showAccountDetails(){
	if(document.getElementById('credit').checked){
		document.getElementById('showAccount').style.display='block';
		document.getElementById('showAccount1').style.display='none';
		document.getElementById('showNetAccount').style.display='none';
		
	}
	else if(document.getElementById('debit').checked){
		document.getElementById('showAccount').style.display='none';
		document.getElementById('showAccount1').style.display='block';
		document.getElementById('showNetAccount').style.display='none';
		
	}
 else if(document.getElementById('NetBanking').checked){
       document.getElementById('showNetAccount').style.display='block'; 
       document.getElementById('showAccount').style.display='none';
       document.getElementById('showAccount1').style.display='none';
 }
	else
		document.getElementById('showNetAccount').style.display='none';
	 
}
window.onload= function(){
	document.getElementById('showAccount').style.display='none';
	document.getElementById('showNetAccount').style.display='none';
	 document.getElementById('showAccount1').style.display='none';
}
 </script>
</head>
<body > 

<form method="post" action="#">
<h1 style ="text-align:center;color:purple" ><b>Mode Of Payment</b></h1>

<div align="center">
	<div >
	<div ><h3>Choose Payment Method:</h3></div>
	<div>
	
		<input type="radio" name="modeOfPurchase" onclick="showAccountDetails()" id="credit" value="Credit"/>Credit</br>
		<div   id="showAccount">
		<div>
			Card Number: <input  type="text"  path="" ></br></br>
			CVV Number: <input  type="text"  path=""></br></br>	
			
		</div>
	</div>
		<input type="radio" name="modeOfPurchase" onclick="showAccountDetails()" id="debit" value="Debit"/>Debit</br>
		<div   id="showAccount1">
		<div>
			Card Number: <input  type="text"  path="" ></br></br>
			
			CVV Number: <input  type="text"  path=""></br></br>	
			
		</div>
	</div> 
		<input type="radio" name="modeOfPurchase" onclick="showAccountDetails()" id="NetBanking" value="NetBanking"/>Net Banking</br>
		<div   id="showNetAccount">
		<div>
			Account Number: <input  type="text"  path="" ><br><br>
			User Name: <input  type="text"  path="" ></br></br>
			Password: <input  type="text"  path=""></br></br>	
		</div>
	</div>
		<input type="radio" name="modeOfPurchase" onclick="showAccountDetails()" id="CashOnDelivery" value="CashOnDelivery"/>Cash on Delivery</br>
		
	</div>
	</div>
	
	   <a href=""> 
          
          <br><br><button type="button" class="btn btn-success">
                           Proceed to pay
                        </button></a>


	
</div>
</form>
<!-- </body>
</html> -->
