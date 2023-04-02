package main

import (
	"bufio"
	"fmt"
	"os"
)

func main() {
	//Enter your code here. Read input from STDIN. Print output to STDOUT
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

	fmt.Println("Hello, World.")

	for _, eachLine := range inputs {
		fmt.Println(eachLine)
	}

}
