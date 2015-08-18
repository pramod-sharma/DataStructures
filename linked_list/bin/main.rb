require_relative '../lib/linked_list'

linked_list = LinkedList.new
[1, 2, 3, 4].each do |val|
  linked_list.insert(val)
end
