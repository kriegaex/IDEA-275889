package org.example

import spock.lang.Specification

class PersonTest extends Specification {
  def test() {
    given:
    def person = new Person(11, "John Doe")

    expect:
    person.id == 11
    person.name == "John Doe"
  }
}
