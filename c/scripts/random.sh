#!/bin/bash
echo running...
# using SRANDOM for better randomness ... > bash5.1
# todo : add unicode to charset to increase complexity, lower compatibility a little
alnum=( {a..z} {A..Z} {0..9} )
punct=('!' '"' '#' '\' '$' '%' '&' '(' ')' '*' '+' ',' '-' '.' '/' ':' ';' '<' '=' '>' '?' '@' '[' ']' '^' '_' '{' '|' '}' '~' '`' )
unicode=($'\u00A0' $'\u00A1' $'\u00A2' $'\u00A3' $'\u00A4' $'\u00A5')
result=()
chars=( "${alnum[@]}" "${punct[@]}" "${unicode[@]}")
sz=${#chars[@]}
echo $sz
printf '%s' "${chars[@]}";echo
for (( i=0; i<${#chars[@]}; i++ )); do
    #char="${str:$i:1}"
    result+="${chars[$((SRANDOM%sz))]}"
done
printf '%s ' "${result[@]}";
