class Node
  attr_accessor :child
  attr_reader :value, :parent

  def initialize(value, parent_node)
    @value = value
    @parent = parent_node
  end
end