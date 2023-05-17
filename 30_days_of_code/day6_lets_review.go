package main

import (
	"bufio"
	"os"
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
}
