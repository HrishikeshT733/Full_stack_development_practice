#include "Header.h"
float dist(int ix1, int iy1, int ix2, int iy2) {
float d;
	d = (float)(sqrt(((iy2 * iy2) - (2 * iy2 * iy1) + (iy1 * iy1)) + ((ix2 * ix2) - (2 * ix2 * ix1) + (ix1 * ix1))));
	return d;
}