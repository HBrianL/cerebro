# cerebro
Buscador de mutantes.

### URL de api:
`http://cerebro-env.phnudt2pwt.sa-east-1.elasticbeanstalk.com/`

### Endpoints:
### POST -> /mutant
#### Parameters
body (ej.): `{ “dna”:["ATGCGA","CAGTGC","TTATGT","AGAAGG","CCCCTA","TCACTG"] }`

Responses:
* HTTP 200-OK: si el adn es de mutant.
* HTTP 403-Forbidden: si el adn es de humano.
* HTTP 400-BadRequest: si la cadena de adn es inválida o mal formada.

### GET -> /stats
Responses (ej.):
`{“count_mutant_dna”:40, “count_human_dna”:100 “ratio”:0.4}`
