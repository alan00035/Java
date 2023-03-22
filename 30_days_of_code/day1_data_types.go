package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
)

func datatypes() {
	var _ = strconv.Itoa // Ignore this comment. You can still use the package "strconv".

	var i uint64 = 4
	var d float64 = 4.0
	var s string = "HackerRank "

	scanner := bufio.NewScanner(os.Stdin)
	var inputs []string
	for {
		scanner.Scan()
		input := scanner.Text()

		if len(input) == 0 {
			break
		}

		inputs = append(inputs, input)
	}

	input1, err := strconv.ParseUint(inputs[0], 10, 64)

	if err == nil {
		fmt.Println(input1 + i)
	}

	input2, err := strconv.ParseFloat(inputs[1], 64)

	if err == nil {
		fmt.Printf("%.1f\n", input2+d)
	}

	fmt.Println(s + inputs[2])

}
