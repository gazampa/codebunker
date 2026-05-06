#!/bin/bash
echo running...
# using SRANDOM for better randomness ... > bash5.1
# todo : add unicode to charset to increase complexity, lower compatibility a little
alnum=( {a..z} {A..Z} {0..9} )
punct=('!' '"' '#' '\' '$' '%' '&' '(' ')' '*' '+' ',' '-' '.' '/' ':' ';' '<' '=' '>' '?' '@' '[' ']' '^' '_' '{' '|' '}' '~' '`' )
unicode=($'\u00A0' $'\u00A9' $'\u00AE' $'\u00B5' $'\u00BF' $'\u00C2' $'\u00FA' $'\u00FB' $'\u1BA8' $'\u1D8AF' $'\u1F60E' $'\u1F606' \
          $'\u00A0' $'\u00A9' $'\u00AE' $'\u00B5' $'\u00BF' $'\u00A0' $'\u00A9' $'\u00AE' $'\u00B5' $'\u00BF' )
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
