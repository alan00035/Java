package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
)

func main() {

	var inputs []string
	scanner := bufio.NewScanner(os.Stdin)

	for {
		scanner.Scan()
		input := scanner.Text()
		if len(input) == 0 {
			break
		}

		inputs = append(inputs, input)
	}

	count, err := strconv.Atoi(inputs[0])

	if err != nil {
		for i := 0; i < count; i++ {
			str := inputs[i]
			chars := []rune(str)
			for x := 0; x < len(chars); x++ {
				if x%2 == 0 {
					// a := append(chars[:x])
				} else {
					// b := append(chars[:x])
					// fmt.Println(a,b)
				}

			}

			fmt.Println(a, " ", b)
		}
	}
}
