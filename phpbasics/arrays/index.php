<?php

// older way
//$months = array('Jan','Feb','March','April','May');

//php 5.4 and up way
//$months = ['Jan','Feb','March','April','May'];

$tuts_sites = array(
    'nettuts' => 'http://net.tutsplus.com',
    'psdtuts' => 'http://psd.tutsplus.com',
    'wptuts' => 'http://wp.tutsplus.com',

);

//var_dump($months);

//print_r($tuts_sites);

?>
<!doctype html>
<html lang="en">
<head>
    <title>Arrays</title>
</head>
<body>
    <h1>Arrays</h1>
    <ul>
        <?php

//            foreach($tuts_sites as $tut_site){
//            echo "<li>$tut_site</li>";
//        }

//        foreach ($tuts_sites as $name => $url) {
//
//            echo "<li><a href='$url'>" . ucwords($name) . " + </a> </li>";
//
//        }

        foreach($tuts_sites as $name => $url) : ?>
            <li>
                <a href="<?= $url; ?>"><?= $name; ?></a>
            </li>
        <?php endforeach ?>
    </ul>
</body>
</html>