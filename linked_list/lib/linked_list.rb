require_relative 'node'

class LinkedList
  attr_reader :root, :terminator

  # def initialize(value)
  #   @root = Node.new(value, nil)
  #   @terminator = @root
  # end

  def insert(value)
    new_node = Node.new(value, @terminator)
    if @terminator
      @terminator.child = new_node
    else
      @root = new_node
    end
    @terminator = new_node
  end

  def remove
    if @terminator != @root
      @terminator.parent.child = nil
      @terminator = @terminator.parent
    else
      puts "Can't remove last element of stack"
    end
  end
end