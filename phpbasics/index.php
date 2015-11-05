<?php
include 'krumo/class.krumo.php';

//$cols = 13;
//$rows = 13;
//
//echo "<table border=\"1\">";
//
//for ($r =1; $r < $rows; $r++){
//
//    echo'<tr>';
//
//    for ($c = 1; $c < $cols; $c++)
//        echo '<td>' . $c*$r .'</td>';
//    echo '</tr>'; // close tr tag here
//
//}
//
//echo"</table>";

$integers = array(1,3,4,53,84,100,50,66,7,38,9);

/**
*Sort list of integers into Odd and Even Lists.
*
*@param array  list of random integers
*
*@return array  2 tier array containing a list of ODD and EVEN numbers, sorted.
*/
function sortOddEven($integers){

  foreach ($integers as $integer) {
    if ($integer % 2 == 0) {
      $even[] = $integer;
    }else{
      $odd[] = $integer;
    }
  }
  return $twoSortedLists = ['Odds' => $odd, 'Evens' => $even];
}

$result = sortOddEven($integers);
krumo($result);





//function  findLargest($integers){
//    $largest = 0;
//
//    foreach ($integers as $integer) {
//
//        if($integer > $largest){
//            $largest = $integer;
//        }
//    }
//
//
//    return $largest;
//
//
//}
//$result = findLargest($integers);
//var_dump($result);

//Create a function that converts the following date format: 2014-05-26 to 05/26/2014.

//$oldDate = '2014-05-26';
//
//function formatDate($oldDate){
//    $newDate = date("m/d/Y", strtotime($oldDate));
//
//    return $newDate;
//
//}
//
//$newDate = formatDate($oldD'
$dsn = 'mysql:host=localhost;dbname=mpadmin';
    $username = 'mpadmin';
    $password = 'mpadmin';
    try {
        $db = new PDO($dsn, $username, $password);
    } catch (PDOException $e) {
        $error_message = $e->getMessage();
        include('database_error.php');
        exit();
    }


?>
<form action="secondpage.php" method="post">
    Your name:
    <input type="text" name="email">
    <input type="submit">
</form>
