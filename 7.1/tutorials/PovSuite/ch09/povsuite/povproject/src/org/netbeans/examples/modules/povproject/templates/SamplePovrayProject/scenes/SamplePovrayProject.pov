// This is a simple red sphere

// first, the camera position
camera {
  location <2,5,-10>
  look_at <0,0,0>
}

// now, some light
light_source {
  <0,-10,0>
  color rgb <1,1,1>
}

// the sphere
sphere {
  <0,0,0>, 5
  pigment { color rgb <1,0,0> }
}