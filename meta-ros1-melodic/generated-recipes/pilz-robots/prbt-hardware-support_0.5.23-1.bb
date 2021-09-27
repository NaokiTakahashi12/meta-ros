# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Control hardware functions of the PRBT manipulator like RUN_PERMITTED for Stop1 functionality."
AUTHOR = "Alexander Gutenkunst <a.gutenkunst@pilz.de>"
HOMEPAGE = "https://wiki.ros.org/prbt_hardware_support"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "LGPLv3"
LICENSE = "LGPL-3.0-only"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=b691248d2f70cdaeeaf13696ada5d47c"

ROS_CN = "pilz_robots"
ROS_BPN = "prbt_hardware_support"

ROS_BUILD_DEPENDS = " \
    canopen-chain-node \
    dynamic-reconfigure \
    libmodbus \
    message-filters \
    message-generation \
    pilz-msgs \
    pilz-utils \
    roscpp \
    sensor-msgs \
    std-msgs \
    std-srvs \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
    urdf \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    message-runtime \
    pilz-msgs \
    roscpp \
    rosservice \
    sensor-msgs \
    std-msgs \
    std-srvs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    message-runtime \
    pilz-msgs \
    roscpp \
    rosservice \
    sensor-msgs \
    std-msgs \
    std-srvs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    cmake-modules \
    code-coverage \
    pilz-testutils \
    rostest \
    rosunit \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/PilzDE/pilz_robots-release/archive/release/melodic/prbt_hardware_support/0.5.23-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/prbt_hardware_support"
SRC_URI = "git://github.com/PilzDE/pilz_robots-release;${ROS_BRANCH};protocol=https"
SRCREV = "6a5ea72df96aa9ba9caaa45d44133fdee54665f6"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}