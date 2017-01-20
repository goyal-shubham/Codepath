<!DOCTYPE HTML>
<html>
<head>
    <style>
        .box {
            margin: 100px;
            border: double;
            background: pink;
            position: absolute;
            top: 10%;
            left: 20%;
        }
    </style>
</head>
<body style="background:yellow">
<div class="box">
    <h2>Tip Calculator</h2>
    <form action="TipCalculator.php" method="GET">
        Bill Amount : $<input type="text" name="billAmount"
                                value="<?php if (isset($_GET['billAmount'])) echo $_GET['billAmount'] ?>"><br>

        <br/>
        Tip Percent : <br/><br/>

        <?php
        for ($i = 0.10;
        $i <= 0.20;
        $i += .05) {
        ?>
        <input type="radio" name="tip"
               value="<?php echo $i ?>" <?PHP echo $selected + ($i * 100) ?>> <?php echo $i * 100 ?>%
        <tab>
            <?php
            }
            ?>
            <br/><br/>
            <input style="text-align: center" type="submit">

    </form>
    <br> <br>
    <?php
    if (
            isset($_GET['billAmount']) && isset($_GET["tip"])) {
        $bill_amount = $_GET['billAmount'];
        $tip_amount = $_GET['tip'];
        if (is_numeric($bill_amount) && $bill_amount > 0 && is_numeric($tip_amount)) {
            $total_tip_amount = (float) $tip_amount * (float)$bill_amount;
            $total = $total_tip_amount + $bill_amount;
        } else {
            echo "<br /><span style='color:Red'>Please Enter Value Amount!!!";
        }
    }
    if (isset($total_tip_amount) && isset($total)) {
        echo '<div style = "border: 4px solid"> Tip Amount: $' . number_format($total_tip_amount, 2) . '<br />';
        echo 'Total Bill: $' . number_format($total, 2) . '</div> <br />';
    }
    ?>
</div>
</body>
</html>