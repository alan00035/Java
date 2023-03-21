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
	for {
		scanner.Scan()
		input := scanner.Text()
		if len(input) == 0 {
			break
		}
		x, err := strconv.ParseUint(input, 0, 64)
		y, err := strconv.ParseFloat(input, 64)
		z := input

		if err != nil {
			fmt.Println(i + uint64(x))
			fmt.Println(d + float64(y))
			fmt.Println(s + " " + z)
		}
	}
}
